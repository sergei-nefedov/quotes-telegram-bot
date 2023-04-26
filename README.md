# quotes-telegram-bot
Учебный проект. Телеграм-бот (long polling) + контролер REST api, присылающий цитаты с сайта ibash.org.ru. Написан на Java с использованием Spring, PostgreSQL, jsoup.
Задачей было реализовать приложение, представляющее собой сочетание telegram-бота, REST-контроллера и парсера цитат. Функции чат-бота реализованы с помощью библиотеки com.github.pengrad:java-telegram-bot-api, для парсинга использована библиотека jsoup. Цитаты и данные чатов в telegram сохраняются в таблицах PostgreSQL.

Команды бота:<br>
 /start - запуск бота;<br>
 /rand - случайная цитата;<br>
 /next - следующая цитата;<br>
 /prev - предыдущая цитата.<br>

User Endpoints:<br>
GET /api/all - все цитаты<br>
GET /api/page - 1-я страница цитат<br>
GET /api/random - случайная цитата<br>
GET /api/{id} - цитата по id
