CREATE TABLE `characters`
(
  `id` int PRIMARY KEY,
  `name` varchar(255) NOT NULL,
  `race_id` int,
  `home_location_id` int
);

CREATE TABLE `races`
(
  `id` int PRIMARY KEY,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `origin_location_id` int
);

CREATE TABLE `locations`
(
  `id` int PRIMARY KEY,
  `name` varchar(255) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `category` int
);

CREATE TABLE `categories`
(
  `id` int PRIMARY KEY,
  `name` varchar(255) NOT NULL
);

CREATE TABLE `character_relationships`
(
  `relationship` varchar(255) NOT NULL,
  `character_id` int,
  `related_character_id` int
);

CREATE TABLE `items`
(
  `id` int PRIMARY KEY,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `owner_id` int,
  `creator_id` int
);

ALTER TABLE `characters` ADD FOREIGN KEY (`race_id`) REFERENCES `races` (`id`);

ALTER TABLE `characters` ADD FOREIGN KEY (`home_location_id`) REFERENCES `locations` (`id`);

ALTER TABLE `races` ADD FOREIGN KEY (`origin_location_id`) REFERENCES `locations` (`id`);

ALTER TABLE `locations` ADD FOREIGN KEY (`category`) REFERENCES `categories` (`id`);

ALTER TABLE `character_relationships` ADD FOREIGN KEY (`character_id`) REFERENCES `characters` (`id`);

ALTER TABLE `character_relationships` ADD FOREIGN KEY (`related_character_id`) REFERENCES `characters` (`id`);

ALTER TABLE `items` ADD FOREIGN KEY (`owner_id`) REFERENCES `characters` (`id`);

ALTER TABLE `items` ADD FOREIGN KEY (`creator_id`) REFERENCES `characters` (`id`);

