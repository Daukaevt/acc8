3️⃣ Собрать Docker-образ

docker build -t eureka .
Теперь Docker сможет найти jar и собрать образ.

4️⃣ Запустить контейнер

docker run -p 8761:8761 eureka


# 1. Удаляем старый инстанс
kubectl delete deployment eureka
kubectl delete svc eureka   # если сервис был создан

# 2. Запускаем заново
kubectl apply -f eureka-host.yaml

# 3. Проверяем статус
kubectl get pods -o wide

# 4. Смотрим логи
kubectl logs -f deployment/eureka

# 5. Делаем доступ к Eureka из браузера
kubectl port-forward deployment/eureka 8761:8761

# 6. Открываем в браузере
http://localhost:8761/

