SELECT *
FROM Producer
         JOIN Delivery_Address ON Producer.producer_id = Delivery_Address.producer_id
         JOIN Address ON Delivery_Address.city = Address.city
         JOIN Customer ON Address.address_id = Customer.address_id
         JOIN Order_Header ON Customer.customer_id = Order_Header.customer_id
         JOIN Status ON Order_Header.status_id = Status.status_id
         JOIN Order_Detail ON Order_Header.order_header_id = Order_Detail.order_header_id
         JOIN Menu ON Producer.producer_id = Menu.producer_id
         JOIN Menu_Category ON Menu.menu_category_id = Menu_Category.menu_category_id
         JOIN Menu_MenuItem ON Menu.menu_id = Menu_MenuItem.menu_id
         JOIN Menu_Item ON Menu_MenuItem.menu_item_id = Menu_Item.menu_item_id
         JOIN Menu_Item_Category ON Menu_Item.menu_item_category_id = Menu_Item_Category.menu_item_category_id;