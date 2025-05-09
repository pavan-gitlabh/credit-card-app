# credit-card-app

Steps to run 

1. Backend ( tested )

cd backend
mvn spring-boot:run
# Access API at http://localhost:8080/api/cards

2. Frontend ( tested )

cd frontend
npm install
npm start
# Access UI at http://localhost:3000

3. Docker ( not tested )

docker-compose up --build

4. Kubernetes ( not tested )

kubectl apply -f kubernetes/