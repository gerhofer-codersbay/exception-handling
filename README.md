# Exceptions 

Exceptions die von RunTimeException erben sind unchecked Exceptions. Exceptions die von
Exception erben sind checked Exceptions. Checked Exceptions müssen behandelt werden. Eine 
Exception kann durch Verwendung eines Try/Catch Blockes behandelt werden oder muss mittels dem 
throws Keyword in der Methodendeklaration deklarieren, dass diese Exception geworfen werden kann.

InvalidUserException ist eine checked Exception, darum brauchen wir im Konstruktor der User Klasse die `throws InvalidUserException`. 
Da nun der Konstruktor deklariert, dass er eine InvalidUserException schmeißen könnte müssen nun auch alle Methoden, die den Konstruktor der User Klasse
verwenden ein `throws InvalidUserException` deklarieren - in unserem Fall also die Methode `addUser` der Klasse `UserManager`. 

In der Main Klasse verwenden wir die Methode `UserManager.addUser`. Diesen Aufruf behandeln wir mit einem try-catch statement. 