INSERT INTO Status (status)
VALUES ('Pending'),
       ('Completed'),
       ('Cancelled');


INSERT INTO Producer (name, city, description, producer_image, postal_code, street, email, phone_number)
VALUES ('Syrenka Vege Jadło', 'Warsaw', 'opis producenta 1', '/assets/tortilla.jpg' , '123', 'Street1', 'producent1@mail.com', '123-456-789'),
       ('WoooWege', 'Warsaw', 'opis producenta 2', '/assets/tortilla.jpg' , '200', 'Street2', 'producent6@mail.com', '600-456-789'),
       ('Lajkonik', 'Krakow', 'opis producenta 3', '/assets/tortilla.jpg' , '456', 'Street2', 'producent2@mail.com', '987-654-321'),
       ('Indian Food Vege', 'Wroclaw', 'opis producenta 4', '/assets/tortilla.jpg' , '776', 'Street3', 'producent3@mail.com', '555-444-333'),
       ('Fiki Miki Restaurant', 'Wroclaw', 'opis producenta 5', '/assets/tortilla.jpg' , '789', 'Street4', 'producent4@mail.com', '555-888-333'),
       ('Wegetarian', 'Wroclaw', 'opis producenta 6', '/assets/tortilla.jpg' , '800', 'Street5', 'producent5@mail.com', '555-000-333');


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



INSERT INTO Menu_Category (name)
VALUES ('Śniadania'),
       ('Dania główne'),
       ('Napoje');


INSERT INTO Menu (description, menu_image, producer_id, menu_category_id)
VALUES ('info producent1-1', '/assets/tortilla.jpg', 1, 1),
       ('info producent1-2', '/assets/sup.jpg', 1, 2),
       ('info producent1-3', '/assets/drink.jpg', 1, 3),
       ('info producent2-1', '/assets/tortilla.jpg', 2, 1),
       ('info producent2-2', '/assets/sup.jpg', 2, 2),
       ('info producent2-3', '/assets/drink.jpg', 2, 3),
       ('info producent3-2', '/assets/sup.jpg', 3, 2),
       ('info producent4-1', '/assets/tortilla.jpg', 4, 1),
       ('info producent4-2', '/assets/sup.jpg', 4, 2),
       ('info producent4-3', '/assets/drink.jpg', 4, 3),
       ('info producent5-3', '/assets/drink.jpg', 5, 3),
       ('info producent6-1', '/assets/drink.jpg', 6, 1),
       ('info producent6-2', '/assets/drink.jpg', 6, 2),
       ('info producent6-3', '/assets/drink.jpg', 6, 3);



INSERT INTO Menu_Item_Category (name)
VALUES ('Śniadanie'),
       ('Danie Główne'),
       ('Deser'),
       ('Napój'),
       ('Sałatka'),
       ('Zupa');


INSERT INTO Menu_Item (name, description, price, image, menu_item_category_id)
VALUES ('Tofuśnica', 'najlepsza tofuśnica pod słońcem', 15.99, '/assets/tortilla.jpg', 1),
       ('Omlet', 'vege omlet coś wspaniałego', 16.50, '/assets/tortilla.jpg', 1),
       ('Owsianka', 'Power z rana to owsiana', 12.50, '/assets/tortilla.jpg', 1),
       ('Kaszotto z warzywami', 'Gryczana kasza daje więcej niż myślisz', 29.99, '/assets/tortilla.jpg', 2),
       ('Sałatka grecka', 'Sałatka grecka dobra na wszystko', 18.00, '/assets/tortilla.jpg', 5),
       ('Zupa pomidorowa z ryżem', 'Pyszna zupa na bazie prawdziwych pomidorów', 12.99, '/assets/tortilla.jpg', 6),
       ('Zupa krem z brokułów', 'Brokuł to symbol siły', 14.50, '/assets/tortilla.jpg', 6),
       ('Kawa latte', 'Kawa to bezkofeinowa wspaniałe latte', 8.50, '/assets/tortilla.jpg', 4),
       ('Herbata zielona', 'jak herbata to tylko z jaśminem z Wietnamu', 6.00, '/assets/tortilla.jpg', 4);


INSERT INTO Menu_MenuItem (menu_item_id, menu_id)
VALUES (1, 1),
       (2, 2),
       (3, 1),
       (4, 5),
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


INSERT INTO Order_Detail (order_number, order_header_id, menu_item_id, total_price)
VALUES ('ORD001', 1, 1, 15.99),
       ('ORD002', 1, 3, 16.50),
       ('ORD003', 2, 5, 18.00),
       ('ORD004', 3, 7, 14.50);
