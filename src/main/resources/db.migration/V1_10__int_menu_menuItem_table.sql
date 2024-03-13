CREATE TABLE Menu_MenuItem
(
    menu_item_id INT,
    menu_id      INT,
    PRIMARY KEY (menu_item_id, menu_id),
    FOREIGN KEY (menu_item_id) REFERENCES Menu_Item (menu_item_id),
    FOREIGN KEY (menu_id) REFERENCES Menu (menu_id)
);

