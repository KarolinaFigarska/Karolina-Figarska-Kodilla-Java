CREATE TABLE ISSUESLISTS (
                             ID SERIAL PRIMARY KEY,
                             NAME VARCHAR(100)
);

CREATE TABLE ISSUES (
                        ID SERIAL PRIMARY KEY,
                        ISSUESLIST_ID BIGINT UNSIGNED NOT NULL,
                        SUMMARY VARCHAR(100),
                        DESCRIPTION VARCHAR(300),
                        USER_ID_ASSIGNEDTO BIGINT UNSIGNED NOT NULL,
                        FOREIGN KEY (ISSUESLIST_ID) REFERENCES ISSUESLISTS(ID),
                        FOREIGN KEY (USER_ID_ASSIGNEDTO) REFERENCES USERS(ID)
);

COMMIT;

INSERT INTO ISSUESLISTS (NAME)  VALUES ('ToDo');
INSERT INTO ISSUESLISTS (NAME)  VALUES ('In progress');
INSERT INTO ISSUESLISTS (NAME)  VALUES ('Done');


INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (1, 'Malowanie', 'Malownie wewnątrz wszystkich pomieszczeń',3);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (1,'Podłogi', 'Podłogi we wszystkich pomieszczeniach', 2);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (1, 'Drzwi', 'Montaż drzwi wewnętrznych we wszystkich pomieszczeniach', 2);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (1,'Listwy', 'Listwy przypodłogowe we wszystkich pomieszczeniach', 2);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (1, 'Oświetlenie', 'Oprawa oświetleniowa we wszystkich pomieszczeniach', 3);


INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (2,'Dach', 'Budowa dachu', 4);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (2,'Drzwi i okna', 'Montaż drzwi zenetrznych i okien',4);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (2, 'Instalacje', 'Położenie instalacji: woda, kanalizacja, elektryczność', 1);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (2,'Tynki', 'Tynkowanie',5);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (2,'Podłogi','Izolacja podłog',5);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (3,'Projek','Złożyć projekt', 1);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (3,'Dokumenty', 'Złożyć pozwolenie na budowę',1);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (3,'Fundamenty','Rozpoczęcie budowy - położenie fundamentów',4);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (3,'Piwnica','Wykonanie piwnicy',1);

INSERT INTO ISSUES(ISSUESLIST_ID,SUMMARY,DESCRIPTION,USER_ID_ASSIGNEDTO)
VALUES (3,'Sciany', 'Sciany i stropy',4);

COMMIT;

SELECT * FROM ISSUESLISTS;
SELECT * FROM ISSUES;