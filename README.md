# QUB-Challenge-OOP-classes-arraylists-and-searches
Create a java application to service the online shop (Tablets Are Us!)

1. Design and create a class (Tablet.java) that represents a typical tablet. It needs to store :

private String manufacturer;
private String model;
private double price;
private boolean android;
private double size;
private String notes;
It also has a method allDetails() that will output all details to screen i.e.

Tablet details __________________
Manufacturer : Apple
Model : iPad
Price : 338.94
Android : false
Size : 10.2
Notes : 10.2 inch Retina display A10 Fusion chip Up to 10 hours of battery life
Some business rules... (when setting values)

size : in inches needs to be >5 and less than 21 otherwise set to default (warn the user that this has happened i.e. output message to screen)

notes  : limited to 250 characters - Notes will be truncated at 250 chars (just warn the user that this has happened i.e. output message to screen)

2) Test the application and include the following required searches. 

The test classPreview the document including test data (has been started for you...). Download and add it to your solution and complete the searches as specified within this class.

 

Searches required > Output to screen...

1. all screen sizes > 10 inches in size
2. all Apple products (over priced!)
3. all Android tablets
4. Note keyword search .. e.g. search by a key word search (note this is case sensitive)
