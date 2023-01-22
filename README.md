## Setup database
docker network create ext-app-network

docker volume create --driver local --opt type=file --opt device=/var/lib/postgresql/data:/app dbdata

docker run -p 5432:5432 -d --name tech_in_depth -e POSTGRES_PASSWORD=AdminPassword -e POSTGRES_USER=postgres \
-e PGDATA=/var/lib/postgresql/data/pgdata \
-v /tmp/mount:/var/lib/postgresql/data \
postgres
