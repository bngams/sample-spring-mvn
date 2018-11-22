CREATE TABLE INVOICES (
	id identity,
	title varchar(255),
	amount double(2) not null,
	client bigint
);