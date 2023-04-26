# quotes-telegram-bot
Учебный проект. Телеграм-бот (long polling) + контролер REST api, присылающий цитаты с сайта ibash.org.ru. Написан на Java с использованием Spring, PostgreSQL, jsoup.
Задачей было реализовать приложение, представляющее собой сочетание telegram-бота, REST-контроллера и парсера цитат. Функции чат-бота реализованы с помощью библиотеки com.github.pengrad:java-telegram-bot-api, для парсинга использована библиотека jsoup. Цитаты и данные чатов в telegram сохраняются в таблицах PostgreSQL.
Команды бота:
 /start - запуск бота;
 /rand - случайная цитата;
 /next - следующая цитата;
 /prev - предыдущая цитата.

User Endpoints:
GET /api/all - все цитаты
GET /api/page - 1-я страница цитат
GET /api/random - случайная цитата
GET /api/{id} - цитата по id
