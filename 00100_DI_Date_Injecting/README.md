
In Spring, you can inject a Date via two methods :

1.Declare a dateFormat bean, in ¡°customer¡± bean, reference ¡°dateFormat¡± bean as a factory bean. 
The factory method will call SimpleDateFormat.parse() to convert String into Date object automatically..

2. NOT WORKING