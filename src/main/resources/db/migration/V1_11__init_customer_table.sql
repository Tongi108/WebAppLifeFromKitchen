CREATE TABLE Customer
(
    customer_id SERIAL PRIMARY KEY,
    name        VARCHAR(32),
    surname     VARCHAR(32),
    phone_number       VARCHAR(32),
    email       VARCHAR(100) UNIQUE,
    address_id  INT,
    FOREIGN KEY (address_id)
        REFERENCES Address (address_id)
);

