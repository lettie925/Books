DROP TABLE IF EXISTS books_ratings;
DROP TABLE IF EXISTS books_reader;
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

CREATE TABLE books_reader (
	books_reader_id serial,
	reader_id INT NOT NULL,
	book_id INT NOT NULL,
	book_read boolean,
	book_wtr boolean,
	book_dnf boolean,
	book_owned boolean NOT NULL,
	CONSTRAINT PK_books_reader_id PRIMARY KEY (books_reader_id),
	CONSTRAINT FK_books_reader_reader_id FOREIGN KEY (reader_id) REFERENCES reader(reader_id),
	CONSTRAINT FK_books_reader_book_id FOREIGN KEY (book_id) REFERENCES books(book_id)
);

CREATE TABLE books_ratings (
	books_ratings_id serial,
	reader_id INT NOT NULL,
	book_id INT NOT NULL,
	rating INT NOT NULL,
	isLoved boolean,
	isHated boolean,
	CONSTRAINT PK_books_ratings_id PRIMARY KEY (books_ratings_id),
	CONSTRAINT FK_books_ratings_reader_id FOREIGN KEY (reader_id) REFERENCES reader(reader_id),
	CONSTRAINT FK_books_ratings_book_id FOREIGN KEY (book_id) REFERENCES books(book_id)
);


INSERT INTO reader(name, age, favorite_book, favorite_genre) 
VALUES ('Lettie', 27, 'A Court of Mist and Fury', 'Fantasy');

INSERT INTO books(title, genre) VALUES
('The Seven Husbands of Evelyn Hugo', 'Romance, Historical Fiction, Psychological Fiction'), 
('Love Hypothesis', 'Romance, Contemporary Romance'),
('A Court of Thorns and Roses', 'Fantasy'),
('A Court of Mist and Fury', 'Fantasy'),
('A Court of Wings and Ruin', 'Fantasy'),
('A Court of Frost and Starlight', 'Fantasy'),
('A Court of Silver Flames', 'Fantasy'),
('A Court of Mist and Fury', 'Fantasy'),
('Magnolia Parks', 'Romance'),
('Daisy Haites', 'Romance'),
('Magnolia Parks: The Long Way Home', 'Romance'),
('Daisy Haites: The Great Undoing', 'Romance'),
('Normal People', 'Romance'),
('It Ends with Us', 'Romance');

INSERT INTO books_reader(reader_id, book_id, book_read, book_owned) VALUES
(1, 1, TRUE, TRUE),
(1, 2, TRUE, TRUE),
(1, 3, TRUE, TRUE),
(1, 4, TRUE, TRUE),
(1, 5, TRUE, TRUE),
(1, 6, TRUE, TRUE),
(1, 7, TRUE, TRUE),
(1, 8, TRUE, TRUE),
(1, 9, TRUE, TRUE),
(1, 14, TRUE, TRUE);

INSERT INTO books_reader(reader_id, book_id, book_wtr, book_owned) VALUES
(1, 10, TRUE, TRUE),
(1, 11, TRUE, TRUE),
(1, 12, TRUE, TRUE),
(1, 13, TRUE, TRUE);

INSERT INTO books_ratings (reader_id, book_id, rating, isLoved) VALUES
(1, 1, 5, TRUE),
(1, 2, 5, TRUE),
(1, 4, 5, TRUE),
(1, 5, 5, TRUE);

INSERT INTO books_ratings (reader_id, book_id, rating, isHated) VALUES
(1, 14, 5, TRUE);