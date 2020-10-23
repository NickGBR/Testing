

CREATE TABLE data
(
    name_id BIGSERIAL,
    name      TEXT NOT NULL,
    color       TEXT NOT NULL ,
    age        FLOAT NOT NULL ,
    CONSTRAINT p_status PRIMARY KEY (name_id)
);


INSERT INTO data (name, color, age)
VALUES  ('Tom','red', 4),
          ('Tim','black', 4);
