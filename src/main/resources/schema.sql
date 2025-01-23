CREATE TABLE IF NOT EXISTS waste_category (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    description TEXT,
    disposal_guidelines TEXT,
    retrival_guidelines TEXT,
    is_recyclable TEXT
);