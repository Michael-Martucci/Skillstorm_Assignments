warehouses that stock and sell copper

4 branches - names, addresses, id numbers,
manager, number of employees, and max inventory capacity

Inventory will be different forms of commercial copper products
- sheets
- rolls
- lead coat
inventory should have an assigned weight per item in order to remain under max capacity of storage

05/08/24 11:11 pm - fixed bug for static import error in BranchController
and attempted to parse ID to return specific warehouse data - failed

Nexxt steps: (not in order)
- fix parse ID method
- add delete mapping method
- build out Inventory Service class
- figure out how to set max capacity by weight
- figure out if inventory variables should be Int or String
** and how to keep a contineous count by weight of each product
- assign weight to each product type
- Should I use ENUMS for inventory items?
- etc etc...
