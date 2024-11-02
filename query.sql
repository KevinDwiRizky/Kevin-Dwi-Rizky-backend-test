SELECT m.id AS id_murid, m.name, p.status AS pendidikan_terakhir, m.time_create, p.time_create AS time_update
FROM murid m
         JOIN pendidikan p ON m.id = p.id_murid
         JOIN (SELECT id_murid, MAX(time_create) AS max_time_create
               FROM pendidikan GROUP BY id_murid) AS pendidikan_terakhir
              ON p.id_murid = pendidikan_terakhir.id_murid
                  AND p.time_create = pendidikan_terakhir.max_time_create;