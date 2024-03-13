CREATE TABLE producer_delivery_address
(
    producer_id         INT,
    delivery_address_id INT,
    FOREIGN KEY (producer_id) REFERENCES producer (producer_id),
    FOREIGN KEY (delivery_address_id) REFERENCES delivery_address (delivery_address_id),
    CONSTRAINT producer_delivery_address_pk PRIMARY KEY (producer_id, delivery_address_id)
);
