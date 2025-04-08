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

INSERT INTO Movie (title, genre_id, duration, ageRating, description, releaseDate) VALUES
    ('Inception', 7, 148, 13, 'A thief who enters the dreams of others to steal secrets.', '2010-07-16'),
    ('The Godfather', 8, 175, 17, 'The aging patriarch of an organized crime dynasty transfers control to his son.', '1972-03-24'),
    ('Titanic', 6, 195, 13, 'A love story set aboard the ill-fated RMS Titanic.', '1997-12-19'),
    ('The Dark Knight', 3, 152, 14, 'Batman faces the Joker in Gotham City.', '2008-07-18'),
    ('Forrest Gump', 5, 142, 12, 'The story of a man with a low IQ who accomplishes great things.', '1994-07-06'),
    ('The Matrix', 7, 136, 15, 'A hacker discovers the truth about his reality.', '1999-03-31'),
    ('Avengers: Endgame', 3, 181, 13, 'The Avengers assemble to undo Thanos'' snap.', '2019-04-26'),
    ('Pulp Fiction', 8, 154, 17, 'A series of interconnected crime stories.', '1994-10-14'),
    ('Finding Nemo', 9, 100, 0, 'A clownfish searches for his lost son.', '2003-05-30'),
    ('The Lion King', 9, 88, 0, 'A young lion cub flees after the death of his father.', '1994-06-24');

INSERT INTO Employee (name, email, phoneNumber, birthDate, department_Id, salary, hireDate) VALUES
    ('John Doe', 'john.doe@example.com', '123-456-7890', '1994-10-14', 3, 60000, '2015-06-01'),
    ('Jane Smith', 'jane.smith@example.com', '987-654-3210', '1993-03-14', 1, 50000, '2018-09-15'),
    ('Robert Brown', 'robert.brown@example.com', '555-123-4567', '1901-10-13', 2, 75000, '2010-03-22'),
    ('Emily Davis', 'emily.davis@example.com', '444-987-6543', '1975-02-24', 4, 55000, '2017-11-30'),
    ('Michael Wilson', 'michael.wilson@example.com', '333-456-7890', '2001-10-14', 1, 80000, '2008-05-20');

INSERT INTO Customer (name, email, phoneNumber, birthDate, loyaltyPoints, favorite_Genre) VALUES
    ('Alice Johnson', 'alice.johnson@example.com', '111-222-3333', '1994-10-14', 64, 4),
    ('Bob Martinez', 'bob.martinez@example.com', '222-333-4444', '1994-10-14', 11, 7),
    ('Charlie Lee', 'charlie.lee@example.com', '333-444-5555', '1994-10-14', 0, 1),
    ('Diana Cooper',  'diana.cooper@example.com', '444-555-6666', '1994-10-14', 420, 4),
    ('Ethan Wright', 'ethan.wright@example.com', '555-666-7777', '1994-10-14', 69, 2);

INSERT INTO Review (customer_Id, movie_Id, comment, rating) VALUES
    (1, 7, 'Great movie!', 5),
    (2, 2, 'Loved it! Definitely worth watching.', 5),
    (3, 5, 'Not my cup of tea, but well-made.', 3),
    (4, 1, 'An absolute masterpiece. 10/10!', 5),
    (1, 5, 'Decent movie, but could’ve been better.', 4),
    (3, 9, 'Boring and predictable, wouldn’t recommend.', 2),
    (1, 2, 'Fantastic cinematography, weak storyline.', 4),
    (3, 1, 'A fun watch for the whole family!', 5),
    (1, 3, 'Incredible performances by the cast!', 5),
    (1, 1, 'Not what I expected, but pleasantly surprised.', 4),
    (1, 8, 'Too long and dragged in the middle.', 3),
    (1, 2, 'Great concept, but poorly executed.', 3),
    (1, 1, 'A must-watch for fans of the genre!', 5),
    (1, 8, 'I laughed so much, best comedy this year!', 5),
    (1, 6, 'Scary as hell! Loved every second.', 5),
    (1, 5, 'Predictable plot but good action sequences.', 4),
    (1, 3, 'Dialogue felt forced, but the visuals were stunning.', 4),
    (1, 2, 'Left me thinking about it for days!', 5),
    (1, 1, 'A modern classic. Will rewatch for sure!', 5),
    (2, 4, 'Had potential, but weak character development.', 3),
    (2, 7, 'Absolutely terrible. Waste of time.', 1),
    (2, 5, 'Decent, but I wouldn’t watch it again.', 3),
    (2, 3, 'Amazing soundtrack, fits every scene perfectly!', 5),
    (1, 3, 'A nostalgic trip down memory lane!', 5),
    (2, 7, 'Had a few funny moments, but overall forgettable.', 3),
    (2, 4, 'A refreshing take on a classic story!', 4),
    (2, 4, 'The ending ruined the whole movie for me.', 2),
    (2, 4, 'Strong start but fizzled out towards the end.', 3),
    (2, 9, 'If you love action, you’ll love this!', 5),
    (3, 1, 'It’s okay. Not bad, not great.', 3);

INSERT INTO screeningroom (id, roomNumber, seats) VALUES
    (1, 'C1', 50),  -- Budget
    (2, 'C2', 65),  -- Budget
    (3, 'C3', 75),  -- Budget
    (4, 'B1', 60),  -- Mid-range
    (5, 'B2', 55),  -- Mid-range
    (6, 'B3', 60),  -- Mid-range
    (7, 'B4', 80),  -- Mid-range
    (8, 'A1', 80),  -- Premium
    (9, 'A2', 90),  -- Premium
    (10, 'A3', 100);-- Premium

-- Equipment
-- IDs 1–10: Projectors
INSERT INTO equipment (id, name, description, price, screening_room_id) VALUES
    (1, 'Projector - Standard HD', '1080p digital cinema projector with moderate brightness.', 15000.00, 1),
    (2, 'Projector - Standard HD', '1080p digital cinema projector with moderate brightness.', 15000.00, 2),
    (3, 'Projector - Standard HD', '1080p digital cinema projector with moderate brightness.', 15000.00, 3),
    (4, 'Projector - 4K Laser', '4K laser projector with high dynamic range support.', 45000.00, 4),
    (5, 'Projector - 4K Laser', '4K laser projector with high dynamic range support.', 45000.00, 5),
    (6, 'Projector - 4K Laser', '4K laser projector with high dynamic range support.', 45000.00, 6),
    (7, 'Projector - 4K Laser', '4K laser projector with high dynamic range support.', 45000.00, 7),
    (8, 'Projector - IMAX Grade', 'IMAX-grade ultra-high resolution projector.', 90000.00, 8),
    (9, 'Projector - IMAX Grade', 'IMAX-grade ultra-high resolution projector.', 90000.00, 9),
    (10, 'Projector - IMAX Grade', 'IMAX-grade ultra-high resolution projector.', 90000.00, 10);

-- IDs 11–20: Sound Systems
INSERT INTO equipment (id, name, description, price, screening_room_id) VALUES
    (11, 'Sound System - Basic 5.1', 'Basic 5.1 surround sound system.', 5000.00, 1),
    (12, 'Sound System - Basic 5.1', 'Basic 5.1 surround sound system.', 5000.00, 2),
    (13, 'Sound System - Basic 5.1', 'Basic 5.1 surround sound system.', 5000.00, 3),
    (14, 'Sound System - 7.1 THX Certified', 'Premium 7.1 system with THX certification.', 12000.00, 4),
    (15, 'Sound System - 7.1 THX Certified', 'Premium 7.1 system with THX certification.', 12000.00, 5),
    (16, 'Sound System - Dolby Atmos', 'Immersive Dolby Atmos setup with ceiling speakers.', 20000.00, 6),
    (17, 'Sound System - Dolby Atmos', 'Immersive Dolby Atmos setup with ceiling speakers.', 20000.00, 7),
    (18, 'Sound System - Dolby Atmos', 'Immersive Dolby Atmos setup with ceiling speakers.', 20000.00, 8),
    (19, 'Sound System - Dolby Atmos', 'Immersive Dolby Atmos setup with ceiling speakers.', 20000.00, 9),
    (20, 'Sound System - Dolby Atmos', 'Immersive Dolby Atmos setup with ceiling speakers.', 20000.00, 10);

-- IDs 21–30: Screens
INSERT INTO equipment (id, name, description, price, screening_room_id) VALUES
    (21, 'Screen - Matte White', 'Standard matte white projection screen (25 ft).', 3000.00, 1),
    (22, 'Screen - Matte White', 'Standard matte white projection screen (25 ft).', 3000.00, 2),
    (23, 'Screen - Matte White', 'Standard matte white projection screen (25 ft).', 3000.00, 3),
    (24, 'Screen - Acoustic Transparent', '30 ft acoustically transparent screen for hidden speakers.', 8000.00, 4),
    (25, 'Screen - Acoustic Transparent', '30 ft acoustically transparent screen for hidden speakers.', 8000.00, 5),
    (26, 'Screen - Curved 4K', 'Curved 4K-optimized screen for enhanced immersion.', 10000.00, 6),
    (27, 'Screen - Curved 4K', 'Curved 4K-optimized screen for enhanced immersion.', 10000.00, 7),
    (28, 'Screen - Curved 4K', 'Curved 4K-optimized screen for enhanced immersion.', 10000.00, 8),
    (29, 'Screen - Curved 4K', 'Curved 4K-optimized screen for enhanced immersion.', 10000.00, 9),
    (30, 'Screen - Curved 4K', 'Curved 4K-optimized screen for enhanced immersion.', 10000.00, 10);

-- IDs 31–40: AV Racks
INSERT INTO equipment (id, name, description, price, screening_room_id) VALUES
    (31, 'AV Rack - Basic', 'Standard AV rack with cooling fans.', 800.00, 1),
    (32, 'AV Rack - Basic', 'Standard AV rack with cooling fans.', 800.00, 2),
    (33, 'AV Rack - Basic', 'Standard AV rack with cooling fans.', 800.00, 3),
    (34, 'AV Rack - Professional', 'Professional-grade AV rack with power management.', 1200.00, 4),
    (35, 'AV Rack - Professional', 'Professional-grade AV rack with power management.', 1200.00, 5),
    (36, 'AV Rack - Enclosed', 'Enclosed AV rack with noise insulation.', 1800.00, 6),
    (37, 'AV Rack - Enclosed', 'Enclosed AV rack with noise insulation.', 1800.00, 7),
    (38, 'AV Rack - Enclosed', 'Enclosed AV rack with noise insulation.', 1800.00, 8),
    (39, 'AV Rack - Enclosed', 'Enclosed AV rack with noise insulation.', 1800.00, 9),
    (40, 'AV Rack - Enclosed', 'Enclosed AV rack with noise insulation.', 1800.00, 10);

-- IDs 41–50: Lighting
INSERT INTO equipment (id, name, description, price, screening_room_id) VALUES
    (41, 'Lighting - Manual Dimmers', 'Manual dimmer system for basic light control.', 500.00, 1),
    (42, 'Lighting - Manual Dimmers', 'Manual dimmer system for basic light control.', 500.00, 2),
    (43, 'Lighting - Manual Dimmers', 'Manual dimmer system for basic light control.', 500.00, 3),
    (44, 'Lighting - Remote DMX', 'Remote-controlled DMX lighting system.', 3000.00, 4),
    (45, 'Lighting - Remote DMX', 'Remote-controlled DMX lighting system.', 3000.00, 5),
    (46, 'Lighting - Remote DMX', 'Remote-controlled DMX lighting system.', 3000.00, 6),
    (47, 'Lighting - Smart Scene Control', 'Automated lighting with scene presets and app control.', 5000.00, 7),
    (48, 'Lighting - Smart Scene Control', 'Automated lighting with scene presets and app control.', 5000.00, 8),
    (49, 'Lighting - Smart Scene Control', 'Automated lighting with scene presets and app control.', 5000.00, 9),
    (50, 'Lighting - Smart Scene Control', 'Automated lighting with scene presets and app control.', 5000.00, 10);

-- IDs 51–60: Seats
INSERT INTO equipment (id, name, description, price, screening_room_id) VALUES
    (51, 'Seats - Standard Row (10)', 'Fixed standard cinema seats, row of 10.', 2000.00, 1),
    (52, 'Seats - Standard Row (10)', 'Fixed standard cinema seats, row of 10.', 2000.00, 2),
    (53, 'Seats - Standard Row (10)', 'Fixed standard cinema seats, row of 10.', 2000.00, 3),
    (54, 'Seats - Recliner Row (10)', 'Recliner seating with cup holders, row of 10.', 5000.00, 4),
    (55, 'Seats - Recliner Row (10)', 'Recliner seating with cup holders, row of 10.', 5000.00, 5),
    (56, 'Seats - Recliner Row (10)', 'Recliner seating with cup holders, row of 10.', 5000.00, 6),
    (57, 'Seats - Recliner Row (10)', 'Recliner seating with cup holders, row of 10.', 5000.00, 7),
    (58, 'Seats - Luxury Leather Row (10)', 'Luxury leather recliners with USB ports, row of 10.', 9000.00, 8),
    (59, 'Seats - Luxury Leather Row (10)', 'Luxury leather recliners with USB ports, row of 10.', 9000.00, 9),
    (60, 'Seats - Luxury Leather Row (10)', 'Luxury leather recliners with USB ports, row of 10.', 9000.00, 10);

-- IDs 61–70: Media Servers
INSERT INTO equipment (id, name, description, price, screening_room_id) VALUES
    (61, 'Media Server - Basic SSD', 'Entry-level media server with 2TB SSD.', 3000.00, 1),
    (62, 'Media Server - Basic SSD', 'Entry-level media server with 2TB SSD.', 3000.00, 2),
    (63, 'Media Server - Basic SSD', 'Entry-level media server with 2TB SSD.', 3000.00, 3),
    (64, 'Media Server - RAID Storage', 'High-capacity RAID server for redundancy.', 10000.00, 4),
    (65, 'Media Server - RAID Storage', 'High-capacity RAID server for redundancy.', 10000.00, 5),
    (66, 'Media Server - RAID Storage', 'High-capacity RAID server for redundancy.', 10000.00, 6),
    (67, 'Media Server - RAID Storage', 'High-capacity RAID server for redundancy.', 10000.00, 7),
    (68, 'Media Server - Cloud-Connected', 'Cloud-connected server with remote streaming.', 15000.00, 8),
    (69, 'Media Server - Cloud-Connected', 'Cloud-connected server with remote streaming.', 15000.00, 9),
    (70, 'Media Server - Cloud-Connected', 'Cloud-connected server with remote streaming.', 15000.00, 10);

-- IDs 71–80: Acoustic Panels
INSERT INTO equipment (id, name, description, price, screening_room_id) VALUES
    (71, 'Acoustic Panels - Foam', 'Basic foam acoustic treatment panels.', 500.00, 1),
    (72, 'Acoustic Panels - Foam', 'Basic foam acoustic treatment panels.', 500.00, 2),
    (73, 'Acoustic Panels - Foam', 'Basic foam acoustic treatment panels.', 500.00, 3),
    (74, 'Acoustic Panels - Fabric Wrapped', 'Fabric-wrapped panels for sound absorption and style.', 1500.00, 4),
    (75, 'Acoustic Panels - Fabric Wrapped', 'Fabric-wrapped panels for sound absorption and style.', 1500.00, 5),
    (76, 'Acoustic Panels - Fabric Wrapped', 'Fabric-wrapped panels for sound absorption and style.', 1500.00, 6),
    (77, 'Acoustic Panels - Fabric Wrapped', 'Fabric-wrapped panels for sound absorption and style.', 1500.00, 7),
    (78, 'Acoustic Panels - Designer Wood Finish', 'Premium acoustic panels with wood finish.', 3000.00, 8),
    (79, 'Acoustic Panels - Designer Wood Finish', 'Premium acoustic panels with wood finish.', 3000.00, 9),
    (80, 'Acoustic Panels - Designer Wood Finish', 'Premium acoustic panels with wood finish.', 3000.00, 10);
