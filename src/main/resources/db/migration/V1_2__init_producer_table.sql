CREATE TABLE Producer
(
    producer_id    SERIAL PRIMARY KEY,
    city           VARCHAR(32),
    name           VARCHAR(32) UNIQUE,
    description    VARCHAR(255),
    producer_image VARCHAR(100),
    postal_code    VARCHAR(32),
    street         VARCHAR(32),
    email          VARCHAR(64),
    phone_number   VARCHAR(32)
);

