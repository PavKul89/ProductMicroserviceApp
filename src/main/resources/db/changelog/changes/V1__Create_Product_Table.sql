-- Создание схемы, если она не существует
CREATE SCHEMA IF NOT EXISTS product_service;

-- Создание таблицы внутри схемы, если она не существует
CREATE TABLE IF NOT EXISTS product_service.product (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(500) NOT NULL,
    quantity INTEGER NOT NULL,
    price DOUBLE PRECISION NOT NULL
    );

