CREATE TABLE Delivery_Address
(
    delivery_address_id SERIAL PRIMARY KEY,
    street              VARCHAR(32),
    city                VARCHAR(32),
    postal_code         VARCHAR(32),
    FOREIGN KEY (producer_id) REFERENCES Producer (producer_id)
);

