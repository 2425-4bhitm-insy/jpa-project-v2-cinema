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

INSERT INTO Employee (name, email, phoneNumber, birthDate, department, salary, hireDate) VALUES
    ('John Doe', 'john.doe@example.com', '123-456-7890', '1994-10-14', 'TICKET_SALES', 60000, '2015-06-01'),
    ('Jane Smith', 'jane.smith@example.com', '987-654-3210', '1993-03-14', 'MARKETING', 50000, '2018-09-15'),
    ('Robert Brown', 'robert.brown@example.com', '555-123-4567', '1901-10-13', 'SECURITY', 75000, '2010-03-22'),
    ('Emily Davis', 'emily.davis@example.com', '444-987-6543', '1975-02-24', 'MARKETING', 55000, '2017-11-30'),
    ('Michael Wilson', 'michael.wilson@example.com', '333-456-7890', '2001-10-14', 'EVENTS', 80000, '2008-05-20');

INSERT INTO Customer (name, email, phoneNumber, birthDate, favoriteGenre) VALUES
    ('Alice Johnson', 'alice.johnson@example.com', '111-222-3333', '1994-10-14', 'ROMANCE'),
    ('Bob Martinez', 'bob.martinez@example.com', '222-333-4444', '1994-10-14', 'ACTION'),
    ('Charlie Lee', 'charlie.lee@example.com', '333-444-5555', '1994-10-14', 'SCI_FI'),
    ('Diana Cooper',  'diana.cooper@example.com', '444-555-6666', '1994-10-14', 'DRAMA'),
    ('Ethan Wright', 'ethan.wright@example.com', '555-666-7777', '1994-10-14', 'ANIMATION');
