create table if not exists example_table(
    id bigserial primary key,
    name varchar(255),
    json_value jsonb not null
);