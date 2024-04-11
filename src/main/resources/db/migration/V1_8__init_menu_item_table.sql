CREATE TABLE Menu_Item
(
    menu_item_id          SERIAL PRIMARY KEY,
    name                  VARCHAR(32),
    description           VARCHAR(300),
    price                 NUMERIC(19, 2),
    image                 VARCHAR(255),
    menu_item_category_id INT,
    FOREIGN KEY (menu_item_category_id) REFERENCES Menu_Item_Category (menu_item_category_id)
);

