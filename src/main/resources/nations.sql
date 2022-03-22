CREATE TABLE continents (
	continent_id int NOT NULL PRIMARY KEY,
	name varchar(255)
);

CREATE TABLE regions (
	region_id int NOT NULL PRIMARY KEY,
	name varchar(100),
	continent_id int,
	FOREIGN KEY (continent_id) REFERENCES continents(continent_id)
);

CREATE TABLE countries (
	country_id int NOT NULL PRIMARY KEY,
	name varchar(50),
	area decimal(10,2),
	national_day Date,
	country_code2 Char(2),
	country_code3 Char(3),
	region_id int,
	FOREIGN KEY (region_id) REFERENCES regions(region_id)
); 

CREATE TABLE guests (
	guest_id int NOT NULL PRIMARY KEY,
	name varchar(255)
); 

CREATE TABLE region_areas (
	region_area decimal(15,2) NOT NULL PRIMARY KEY,
	region_name varchar(100)
);


CREATE TABLE languages (
	language_id int NOT NULL PRIMARY KEY,
	name varchar(100)
);

CREATE TABLE country_languages (
	language_id int,
	country_id int,
	official tinyint(1),
	FOREIGN KEY (language_id) REFERENCES languages(language_id),
	FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

CREATE TABLE country_stats (
	country_id int,
	year int(11),
	popukation int(11),
	gdp decimal(15,0),
	FOREIGN KEY (country_id) REFERENCES countries(country_id)
);