CREATE TABLE Order_Header
(
    order_header_id SERIAL PRIMARY KEY,
    date            DATE,
    status_id       INT,
    customer_id     INT,
    producer_id     INT,
    FOREIGN KEY (status_id)
        REFERENCES Status (status_id),
    FOREIGN KEY (customer_id)
        REFERENCES Customer (customer_id),
    FOREIGN KEY (producer_id)
        REFERENCES Producer (producer_id)
);

