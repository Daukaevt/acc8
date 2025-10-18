3️⃣ Собрать Docker-образ

docker build -t eureka .
Теперь Docker сможет найти jar и собрать образ.

4️⃣ Запустить контейнер

docker run -p 8761:8761 eureka
Открой в браузере http://localhost:8761
