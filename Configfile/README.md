### Configfile

_The class that reads the configuration file_

Contains a JTextField input field labeled "Filename", an "Open file" button, and a JTextArea type field. The class reads the contents of the file specified either by the command parameter, or in the "File name" field, or through the standard "Open File" dialog box called by the "Open file" button and outputs the contents of this file in the JTextArea field.

The file format is as follows:

<li>#Default configuration for JHelp application
<li>#Last modified:
<li>#Sun May 18 00:20:28 MSK 2014
<li>host=localhost
<li>port=12345
<li>version=1.0

In this file, the lines starting with the '#' symbol are a comment, the rest of the lines represent the properties (parameters) of the application: to the left of the '=' sign is the name of the property, and to the right is its value.

A class that contains the following methods:

a) a method that displays the contents of the entire file;
b) a method that allows you to read the value of a property by its name;
c) a method that allows you to replace the value of a property with a given name;
d) a method that allows you to overwrite a file with new parameter values.


---------------------------------------------
_Класс, который считывает конфигурационный файл_

Формат файла следующий:
<li>#Default configuration for JHelp application
<li>#Last modified:
<li>#Sun May 18 00:20:28 MSK 2014
<li>host=localhost
<li>port=12345
<li>version=1.0

В данном файле строки, начинающиеся с символа '#' являются комментарием,остальные строки представляют собой свойства (параметры)приложения: слева от знака '=' стоит имя свойства, а справа - его значение.

Класс, который содержит следующие методы:
<li>а) метод, который выводит на экран содержимое всего файла;
<li>б) метод, который позволяет считать значение свойства по его имени;
<li>в) метод, который позволяет заменить значение свойства с заданным именем;
<li>г) метод, который позволяет перезаписать файл с новыми значениями
параметров.