CREATE TABLE Customer_Address
(
    address_id  SERIAL PRIMARY KEY,
    country     VARCHAR(32),
    city        VARCHAR(32),
    street      VARCHAR(32),
    postal_code VARCHAR(32)
);
