DROP TABLE IF EXISTS books_owned;
DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS reader;

CREATE TABLE reader (
	reader_id serial,
	name varchar(128) NOT NULL,
	age int,
	favorite_book varchar (128),
	favorite_genre varchar(128) NOT NULL,
	CONSTRAINT PK_reader PRIMARY KEY (reader_id)
);

CREATE TABLE books (
	book_id serial,
	title varchar (128) NOT NULL,
	description varchar,
	genre varchar (128),
	CONSTRAINT PK_book PRIMARY KEY (book_id)
);

CREATE TABLE books_owned (
	books_owned_id serial,
	reader_id INT NOT NULL,
	book_id INT NOT NULL,
	book_read boolean,
	CONSTRAINT PK_books_owned PRIMARY KEY (books_owned_id),
	CONSTRAINT FK_books_owned_reader FOREIGN KEY (reader_id) REFERENCES reader(reader_id),
	CONSTRAINT FK_books_owned_book_id FOREIGN KEY (book_id) REFERENCES books(book_id)
);

INSERT INTO reader(name, favorite_genre) 
VALUES ('lettie', 'fantasy');

INSERT INTO books(title, genre) VALUES 
('The Seven Husbands of Evelyn Hugo', 'Romance, Historical Fiction, Psychological Fiction'), 
('Love Hypothesis', 'Romance, Contemporary Romance');

INSERT INTO books_owned(reader_id, book_id, book_read) VALUES
(1, 1, TRUE),
(1, 1, TRUE);