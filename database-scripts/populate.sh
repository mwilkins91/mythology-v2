
#Drop myth if it exists, recreate
docker exec -it mythology_mythology-db_1 mysql -u root -ppassword123  -e "Use myth; $(cat ./createDB.sql)"

# Create tables, foreign keys, etc.
docker exec -it mythology_mythology-db_1 mysql -u root -ppassword123  -e "Use myth; $(cat ./create.sql)"

# Create categories
docker exec -it mythology_mythology-db_1 mysql -u root -ppassword123  -e "Use myth; $(cat ./populate_categories.sql)"

# Create locations
docker exec -it mythology_mythology-db_1 mysql -u root -ppassword123  -e "Use myth; $(cat ./populate_locations.sql)"

# Create races
docker exec -it mythology_mythology-db_1 mysql -u root -ppassword123  -e "Use myth; $(cat ./populate_races.sql)"

# Create characters
docker exec -it mythology_mythology-db_1 mysql -u root -ppassword123  -e "Use myth; $(cat ./populate_characters.sql)"
