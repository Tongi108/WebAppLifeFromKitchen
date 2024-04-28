CREATE TABLE Menu
(
    menu_id     SERIAL PRIMARY KEY,
    name        VARCHAR(255),
    category    VARCHAR(255),
    description VARCHAR(255),
    menu_image  VARCHAR(255),
    price       NUMERIC(19, 2),
    producer_id INT,
    FOREIGN KEY (producer_id) REFERENCES Producer (producer_id)

);

