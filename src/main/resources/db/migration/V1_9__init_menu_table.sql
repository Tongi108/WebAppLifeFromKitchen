CREATE TABLE Menu
(
    menu_id          SERIAL PRIMARY KEY,
    description      VARCHAR(255),
    menu_image       VARCHAR(255),
    producer_id      INT,
    menu_category_id INT,
    FOREIGN KEY (producer_id) REFERENCES Producer (producer_id),
    FOREIGN KEY (menu_category_id) REFERENCES Menu_Category (menu_category_id)
);

