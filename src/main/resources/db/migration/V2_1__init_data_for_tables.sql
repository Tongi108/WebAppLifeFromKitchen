INSERT INTO Status (status)
VALUES ('Pending'),
       ('Completed'),
       ('Cancelled');


INSERT INTO Producer (name, city, description, producer_image, postal_code, street, email, phone_number)
VALUES ('Syrenka Vege Jadło', 'Warsaw', 'opis producenta 1', '/assets/tortilla.jpg' , '123', 'Street1', 'producent1@mail.com', '123-456-789'),
--        ('WoooWege', 'Warsaw', 'opis producenta 2', '/assets/tortilla.jpg' , '200', 'Street2', 'producent6@mail.com', '600-456-789'),
       ('Lajkonik', 'Krakow', 'opis producenta 3', '/assets/tortilla.jpg' , '456', 'Street2', 'producent2@mail.com', '987-654-321'),
       ('Indian Food Vege', 'Wroclaw', 'opis producenta 4', '/assets/tortilla.jpg' , '776', 'Street3', 'producent3@mail.com', '555-444-333');
--        ('Fiki Miki Restaurant', 'Wroclaw', 'opis producenta 5', '/assets/tortilla.jpg' , '789', 'Street4', 'producent4@mail.com', '555-888-333'),
--        ('Wegetarian', 'Wroclaw', 'opis producenta 6', '/assets/tortilla.jpg' , '800', 'Street5', 'producent5@mail.com', '555-000-333');


INSERT INTO Customer_Address (country, city, street, postal_code)
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



INSERT INTO Menu (name, category, description, menu_image, price, producer_id)
VALUES ('Tofuśnica','Śniadania','coś o śniadaniu', '/assets/tortilla.jpg', 17.60,  1),
       ('Kaszotto z warzywami', 'Dania Główne' , 'coś o obiedzie', '/assets/sup.jpg', 28.40, 2),
       ('Herbata zielona', 'Napoje', 'Jakiś opis o napojach', '/assets/drink.jpg', 50.45, 3);



INSERT INTO Customer (name, surname, phone_number, email, address_id)
VALUES ('Jan', 'Kowalski', '123-456-789', 'jan@example.com', 1),
       ('Anna', 'Nowak', '987-654-321', 'anna@example.com', 2),
       ('Piotr', 'Wiśniewski', '555-444-333', 'piotr@example.com', 3);


INSERT INTO Order_Header (date, status_id, customer_id, producer_id)
VALUES ('2024-03-06', 1, 1, 1),
       ('2024-03-06', 1, 2, 2),
       ('2024-03-06', 1, 3, 3);


INSERT INTO Order_Detail (order_number, order_header_id, total_price)
VALUES ('ORD001', 1, 15.99),
       ('ORD002', 1, 16.50),
       ('ORD003', 2, 18.00),
       ('ORD004', 3, 14.50);
