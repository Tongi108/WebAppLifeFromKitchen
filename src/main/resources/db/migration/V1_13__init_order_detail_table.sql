CREATE TABLE Order_Detail
(
    order_detail_id SERIAL PRIMARY KEY,
    order_number VARCHAR(50) UNIQUE,
    order_header_id INT,
    menu_id    INT,
    total_price     NUMERIC(19, 2),
    FOREIGN KEY (order_header_id)
        REFERENCES Order_Header (order_header_id),
    FOREIGN KEY (menu_id)
        REFERENCES Menu (menu_id)
);

