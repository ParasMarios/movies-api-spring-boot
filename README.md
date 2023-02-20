# movies-api-spring-boot

Movies API Spring Boot is a RESTful API built using Java and Spring Boot. 
This API allows users to retrieve and manage movie data, including movie titles, release dates, and ratings.

## Features

- Retrieve a list of all movies in the database
- Retrieve details for a specific movie by ID
- Add review to the database

## Installation

1. Clone this repository to your local machine
2. Open the project in IntelliJ IDEA
3. Run the MoviesApiApplication class to start the server
4. The server will run on http://localhost:8080

## Usage 
#### Retrieving All Movies
To retrieve a list of all movies in the database, make a GET request to the "/api/v1/movies" endpoint.

#### Retrieving a Specific Movie
To retrieve details for a specific movie by ID, make a GET request to the "/api/v1/movies"/{imdbId} endpoint.

#### Adding a New Review
To add a new review to the database, make a POST request to the "api/v1/reviews" endpoint with the review details in the request body.

```sh
{
    "reviewBody": "I hate this movie. This is not for me.",
    "imdbId": "tt1630029"
}
```

## Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork this repository
2. Create a new branch for your feature or bug fix
3. Make your changes and commit them with descriptive commit messages
4. Push your changes to your fork
5. Submit a pull request

## License
This project is licensed under the MIT License. See the LICENSE file for more information.
