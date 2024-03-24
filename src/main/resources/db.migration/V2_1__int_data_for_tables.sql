INSERT INTO Status (status)
VALUES ('Pending'),
       ('Completed'),
       ('Cancelled');


INSERT INTO Producer (name, city, postal_code, street, email, phone_number)
VALUES ('Producent1', 'Warsaw', '123', 'Street1', 'producent1@mail.com', '123-456-789'),
       ('Producent2', 'Krakow', '456', 'Street2', 'producent2@mail.com', '987-654-321'),
       ('Producent3', 'Wroclaw', '789', 'Street3', 'producent3@mail.com', '555-444-333');


INSERT INTO Address (country, city, street, postal_code)
VALUES ('Poland', 'Warsaw', 'Nowa 1', '00-001'),
       ('Poland', 'Krakow', 'Stara 2', '30-002'),
       ('Poland', 'Wroclaw', 'Główna 3', '50-003');


INSERT INTO Delivery_Address (street, city, postal_code)
VALUES ('Street4', 'Warsaw', '00-230'),
       ('Street5', 'Krakow', '30-240'),
       ('Street6', 'Warsaw', '50-560');

INSERT INTO Producer_Delivery_Address (producer_id, delivery_address_id)
VALUES (1, 1),
       (2, 2),
       (3, 3);





INSERT INTO Menu_Category (name)
VALUES ('Śniadanie'),
       ('Zupa'),
       ('Dania główne'),
       ('Napoje');


INSERT INTO Menu (description, producer_id, menu_category_id)
VALUES ('Śniadania', 1, 1),
       ('Zupy', 1, 2),
       ('Dania główne', 1, 3),
       ('Napoje', 1, 4);


INSERT INTO Menu_Item_Category (name)
VALUES ('Śniadanie'),
       ('Zupa'),
       ('Dania główne'),
       ('Napoje');


INSERT INTO Menu_Item (name, price, image, menu_item_category_id)
VALUES ('Jajecznica', 15.99, '...', 1),
       ('Omlet', 16.50, '...', 1),
       ('Owsianka', 12.50, '...', 1),
       ('Risotto z warzyw', 29.99, '...', 3),
       ('Sałatka grecka', 18.00, '...', 2),
       ('Zupa pomidorowa', 12.99, '...', 2),
       ('Zupa krem z brokułów', 14.50, '...', 2),
       ('Kawa latte', 8.50, '...', 4),
       ('Herbata zielona', 6.00, '...', 4);


INSERT INTO Menu_MenuItem (menu_item_id, menu_id)
VALUES (1, 1),
       (2, 1),
       (3, 1),
       (4, 3),
       (5, 3),
       (6, 2),
       (7, 2),
       (8, 4),
       (9, 4);


INSERT INTO Customer (name, surname, phone_number, email, address_id)
VALUES ('Jan', 'Kowalski', '123-456-789', 'jan@example.com', 1),
       ('Anna', 'Nowak', '987-654-321', 'anna@example.com', 2),
       ('Piotr', 'Wiśniewski', '555-444-333', 'piotr@example.com', 3);


INSERT INTO Order_Header (date, status_id, customer_id, producer_id)
VALUES ('2024-03-06', 1, 1, 1),
       ('2024-03-06', 1, 2, 2),
       ('2024-03-06', 1, 3, 3);


INSERT INTO Order_Detail (order_header_id, menu_item_id, total_price)
VALUES (1, 1, 15.99),
       (1, 3, 16.50),
       (2, 5, 18.00),
       (3, 7, 14.50);
