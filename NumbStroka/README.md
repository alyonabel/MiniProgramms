### NumbStroka

_The class representing the main application window inheriting the JFrame class_

It contains two input fields "Number" and "String" on the main panel, the output field "Result" (JTextArea), as well as 4 buttons: "Add", "Output all", "Output only numbers" and "Output only strings".

The behavior of the program meets the following requirements:

<li>the user can enter only integers in the "Number" field, and in the "String" field - an arbitrary, but not an empty string;
<li>when you click on the "Add" button, the contents of the input fields are saved in the internal collection (!) of the application;
<li>when you click on the "Output all" button, all previously entered data is displayed in the "Result" field - both strings and numbers;
<li>when you click on the "Output only numbers" button, only the numeric data entered earlier is displayed in the "Result" field;
<li>when you click on the "Output lines only" button, only the string data entered earlier is displayed in the "Result" field.

-----------------------------------------------
_Класс, представляющий главное окно приложения,наследующий класс JFrame_

Содержит на главной панели два поля ввода "Число" и "Строка", поле вывода "Результат" (JTextArea), а также 4 кнопки: "Добавить", "Вывести всё", "Вывести только числа" и "Вывести только строки".

Поведение программы удовлетворяет следующим требованиям:
<li> пользователь может ввести в поле "Число" только целые числа, а в поле "Строка" - произвольную, но не пустую строку;
<li> при нажатии на кнопку "Добавить" содержимое полей ввода сохраняется во внутренней коллекции(!) приложения;
<li> при нажатии на кнопку "Вывести всё" в поле "Результат" выводятся все ранее ведённые данные - и строки, и числа;
<li> при нажатии на кнопку "Вывести только числа" в поле "Результат" выводятся только числовые данные, введённые ранее;
<li> при нажатии на кнопку "Вывести только строки" в поле "Результат" выводятся только строковые данные, введённые ранее.