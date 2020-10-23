-- Status table.

CREATE TABLE users
(
    name_id BIGSERIAL,
    name      TEXT NOT NULL,
    CONSTRAINT pk_status PRIMARY KEY (name_id)
);

INSERT INTO users (name)
VALUES  ('Nick'),
        ('Anton');