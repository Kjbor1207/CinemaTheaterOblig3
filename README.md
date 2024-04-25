# CinemaTheaterOblig3
My oblig 3 in Webprog, first year at Applied Computer Science, OsloMet.

The oblig contained a cinema program, which were meant to simulaite the experience of ordering cinema tickets.

The first part and structure the of the site were a HTML file, "Cinema.html", which contains a select menu with different films, and different input types for the different values like: number for ticket amount, text for first and last name, email for email (obviously), and tel for phone. All the values were specified with a belonging reg-ex, making sure of correct input by the user.

The javascript file with the same name as the HTML file contains of different functions, like onclick events, taking out the values from the inputs etc. This file does in some degree also contain $JQuerry, which were done both for own experience and in cases where the Javascript wouldn't cooperate.

The rest of the files is all java-files. The first, also called "Cinema", works with the javascript file to make objects of the inputs. The "CinemaController" contains routing requests and also work in response handling for the page. The final "CinemaRepository" Works and communicates with the database.

The project were developed through Intellij, with Spring Boot, H2-database as frameworks.

The project were delievered and finished 25.04.2024 around 18:00;
