INSERT INTO Genre (name, description) VALUES
    ('HORROR', 'Designed to scare and thrill, horror films often feature supernatural elements, monsters, or psychological terror.'),
    ('COMEDY', 'Lighthearted and humorous, comedy movies aim to entertain with jokes, satire, and amusing situations.'),
    ('ACTION', 'Packed with intense sequences, fights, and high-energy stunts, action films keep audiences on the edge of their seats.'),
    ('THRILLER', 'Suspenseful and fast-paced, thrillers keep viewers engaged with twists, tension, and psychological intrigue.'),
    ('DRAMA', 'Focused on emotional storytelling, dramas explore deep characters, real-life struggles, and human relationships.'),
    ('ROMANCE', 'Centered on love and relationships, romance films showcase passion, heartbreak, and emotional connections.'),
    ('SCI_FI', 'Exploring futuristic worlds, advanced technology, and space travel, sci-fi films push the boundaries of imagination.'),
    ('CRIME', 'Revolving around law enforcement, criminals, and moral dilemmas, crime movies dive into heists, mysteries, and investigations.'),
    ('ANIMATION', 'Hand-drawn or CGI visuals, animation films bring imaginative stories to life for all ages.');

INSERT INTO Department (departmentName) VALUES
    ('Sales'),
    ('Management'),
    ('Cleaning'),
    ('Maintenance');

INSERT INTO Movie (title, genre, duration, ageRating, description, releaseDate) VALUES
    ('Inception', 'SCI_FI', 148, 13, 'A thief who enters the dreams of others to steal secrets.', '2010-07-16'),
    ('The Godfather', 'CRIME', 175, 17, 'The aging patriarch of an organized crime dynasty transfers control to his son.', '1972-03-24'),
    ('Titanic', 'ROMANCE', 195, 13, 'A love story set aboard the ill-fated RMS Titanic.', '1997-12-19'),
    ('The Dark Knight', 'ACTION', 152, 14, 'Batman faces the Joker in Gotham City.', '2008-07-18'),
    ('Forrest Gump', 'DRAMA', 142, 12, 'The story of a man with a low IQ who accomplishes great things.', '1994-07-06'),
    ('The Matrix', 'SCI_FI', 136, 15, 'A hacker discovers the truth about his reality.', '1999-03-31'),
    ('Avengers: Endgame', 'ACTION', 181, 13, 'The Avengers assemble to undo Thanos'' snap.', '2019-04-26'),
    ('Pulp Fiction', 'CRIME', 154, 17, 'A series of interconnected crime stories.', '1994-10-14'),
    ('Finding Nemo', 'ANIMATION', 100, 0, 'A clownfish searches for his lost son.', '2003-05-30'),
    ('The Lion King', 'ANIMATION', 88, 0, 'A young lion cub flees after the death of his father.', '1994-06-24');

INSERT INTO Employee (name, email, phoneNumber, birthDate, department_Id, salary, hireDate) VALUES
    ('John Doe', 'john.doe@example.com', '123-456-7890', '1994-10-14', 2, 60000, '2015-06-01'),
    ('Jane Smith', 'jane.smith@example.com', '987-654-3210', '1993-03-14', 0, 50000, '2018-09-15'),
    ('Robert Brown', 'robert.brown@example.com', '555-123-4567', '1901-10-13', 2, 75000, '2010-03-22'),
    ('Emily Davis', 'emily.davis@example.com', '444-987-6543', '1975-02-24', 3, 55000, '2017-11-30'),
    ('Michael Wilson', 'michael.wilson@example.com', '333-456-7890', '2001-10-14', 1, 80000, '2008-05-20');

INSERT INTO Customer (name, email, phoneNumber, birthDate, loyaltyPoints, favorite_Genre) VALUES
    ('Alice Johnson', 'alice.johnson@example.com', '111-222-3333', '1994-10-14', 64, 4),
    ('Bob Martinez', 'bob.martinez@example.com', '222-333-4444', '1994-10-14', 11, 7),
    ('Charlie Lee', 'charlie.lee@example.com', '333-444-5555', '1994-10-14', 0, 1),
    ('Diana Cooper',  'diana.cooper@example.com', '444-555-6666', '1994-10-14', 420, 4),
    ('Ethan Wright', 'ethan.wright@example.com', '555-666-7777', '1994-10-14', 69, 2);

-- INSERT INTO review (customer_Id, movie_Id, comment, rating) VALUES
--     (1, 7, 'Great movie!', 5),
--     (2, 2, 'Loved it! Definitely worth watching.', 5),
--     (3, 5, 'Not my cup of tea, but well-made.', 3),
--     (4, 1, 'An absolute masterpiece. 10/10!', 5),
--     (0, 5, 'Decent movie, but could’ve been better.', 4),
--     (3, 9, 'Boring and predictable, wouldn’t recommend.', 2),
--     (1, 2, 'Fantastic cinematography, weak storyline.', 4),
--     (3, 0, 'A fun watch for the whole family!', 5),
--     (0, 3, 'Incredible performances by the cast!', 5),
--     (1, 1, 'Not what I expected, but pleasantly surprised.', 4),
--     (1, 8, 'Too long and dragged in the middle.', 3),
--     (1, 2, 'Great concept, but poorly executed.', 3),
--     (1, 1, 'A must-watch for fans of the genre!', 5),
--     (1, 8, 'I laughed so much, best comedy this year!', 5),
--     (1, 6, 'Scary as hell! Loved every second.', 5),
--     (1, 5, 'Predictable plot but good action sequences.', 4),
--     (1, 3, 'Dialogue felt forced, but the visuals were stunning.', 4),
--     (1, 2, 'Left me thinking about it for days!', 5),
--     (1, 0, 'A modern classic. Will rewatch for sure!', 5),
--     (2, 4, 'Had potential, but weak character development.', 3),
--     (2, 7, 'Absolutely terrible. Waste of time.', 1),
--     (2, 5, 'Decent, but I wouldn’t watch it again.', 3),
--     (2, 3, 'Amazing soundtrack, fits every scene perfectly!', 5),
--     (0, 3, 'A nostalgic trip down memory lane!', 5),
--     (2, 7, 'Had a few funny moments, but overall forgettable.', 3),
--     (2, 4, 'A refreshing take on a classic story!', 4),
--     (2, 4, 'The ending ruined the whole movie for me.', 2),
--     (2, 4, 'Strong start but fizzled out towards the end.', 3),
--     (2, 9, 'If you love action, you’ll love this!', 5),
--     (3, 0, 'It’s okay. Not bad, not great.', 3);
