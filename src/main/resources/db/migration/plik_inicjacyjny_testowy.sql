CREATE TABLE Status
(
    status_id SERIAL PRIMARY KEY,
    status    VARCHAR(255)
);

CREATE TABLE Producer
(
    producer_id  SERIAL PRIMARY KEY,
    city         VARCHAR(32),
    name         VARCHAR(32) UNIQUE,
    postal_code  VARCHAR(32),
    street       VARCHAR(32),
    email        VARCHAR(64),
    phone_number VARCHAR(32)
);

CREATE TABLE Address
(
    address_id  SERIAL PRIMARY KEY,
    country     VARCHAR(32),
    city        VARCHAR(32),
    street      VARCHAR(32),
    postal_code VARCHAR(32)
);

CREATE TABLE Delivery_Address
(
    delivery_address_id SERIAL PRIMARY KEY,
    street              VARCHAR(32),
    city                VARCHAR(32),
    postal_code         VARCHAR(32)
);

CREATE TABLE producer_delivery_address
(
    producer_id         INT,
    delivery_address_id INT,
    FOREIGN KEY (producer_id) REFERENCES producer (producer_id),
    FOREIGN KEY (delivery_address_id) REFERENCES delivery_address (delivery_address_id),
    CONSTRAINT producer_delivery_address_pk PRIMARY KEY (producer_id, delivery_address_id)
);

CREATE TABLE Menu_Category
(
    menu_category_id SERIAL PRIMARY KEY,
    name             VARCHAR(32)
);

CREATE TABLE Menu
(
    menu_id          SERIAL PRIMARY KEY,
    description      VARCHAR(255),
    producer_id      INT,
    menu_image       BIT,
    menu_category_id INT,
    FOREIGN KEY (producer_id) REFERENCES Producer (producer_id),
    FOREIGN KEY (menu_category_id) REFERENCES Menu_Category (menu_category_id)
);

CREATE TABLE Menu_Item_Category
(
    menu_item_category_id SERIAL PRIMARY KEY,
    name                  VARCHAR(32)
);

CREATE TABLE Menu_Item
(
    menu_item_id          SERIAL PRIMARY KEY,
    name                  VARCHAR(32),
    price                 NUMERIC(19, 2),
    image                 VARCHAR(255),
    menu_item_category_id INT,
    FOREIGN KEY (menu_item_category_id) REFERENCES Menu_Item_Category (menu_item_category_id)
);

CREATE TABLE Menu_MenuItem
(
    menu_item_id INT,
    menu_id      INT,
    PRIMARY KEY (menu_item_id, menu_id),
    FOREIGN KEY (menu_item_id) REFERENCES Menu_Item (menu_item_id),
    FOREIGN KEY (menu_id) REFERENCES Menu (menu_id)
);

CREATE TABLE Customer
(
    customer_id  SERIAL PRIMARY KEY,
    name         VARCHAR(32),
    surname      VARCHAR(32),
    phone_number VARCHAR(32),
    email        VARCHAR(100) UNIQUE,
    address_id   INT,
    FOREIGN KEY (address_id) REFERENCES Address (address_id)
);

CREATE TABLE Order_Header
(
    order_header_id SERIAL PRIMARY KEY,
    date            DATE,
    status_id       INT,
    customer_id     INT,
    producer_id     INT,
    FOREIGN KEY (status_id) REFERENCES Status (status_id),
    FOREIGN KEY (customer_id) REFERENCES Customer (customer_id),
    FOREIGN KEY (producer_id) REFERENCES Producer (producer_id)
);

CREATE TABLE Order_Detail
(
    order_detail_id SERIAL PRIMARY KEY,
    order_number    VARCHAR(50) UNIQUE,
    order_header_id INT,
    menu_item_id    INT,
    total_price     NUMERIC(19, 2),
    FOREIGN KEY (order_header_id)
        REFERENCES Order_Header (order_header_id),
    FOREIGN KEY (menu_item_id)
        REFERENCES Menu_Item (menu_item_id)
);