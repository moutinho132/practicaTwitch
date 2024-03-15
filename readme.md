Curls
curl --location 'localhost:8085/api/persona' \
--header 'Content-Type: application/json' \
--data '{
"nombre": "testing",
"apellido": "prueba",
"edad": 2
}'