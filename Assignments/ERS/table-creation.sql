set schema 'ers';

create table ers_reimbursement
(
	reimb_id serial primary key,
    reimb_amount numeric (10,2),
    reimb_submitted timestamp,
    reimb_resolved timestamp,
    reimb_description varchar(250),
    reimb_receipt bytea, --come back
    reimb_author int,
    reimb_resolver int,
    reimb_status_id int,
    reimb_type_id int
);

create table ers_reimbursement_status
(
	reimb_status_id serial primary key,
    remimb_status varchar(10)
);

create table ers_users
(
	ers_user_id serial primary key,
    ers_username varchar(50) not null,
    ers_password varchar(50) not null,
    user_first_name varchar(100),
    user_last_name varchar(100),
    user_email varchar(150),
    user_role_id int
);

create table ers_reimbursement_type
(
	reimb_type_id serial primary key,
    reimb_type varchar (20) not null
);

create table ers_user_roles
(
	ers_user_role_id serial primary key,
    user_role varchar(20)
);

alter table ers_reimbursement add constraint ers_reimbursement_status_fk foreign key (reimb_status_id) 
references ers_reimbursement_status (reimb_status_id);

alter table ers_reimbursement add constraint ers_reimbursement_type_fk foreign key (reimb_type_id) 
references ers_reimbursement_type (reimb_type_id);

alter table ers_reimbursement add constraint ers_users_fk_auth foreign key (reimb_author)
references ers_users (ers_user_id);

alter table ers_reimbursement add constraint ers_users_fk_resolver foreign key (reimb_resolver)
references ers_users (ers_user_id);

alter table ers_users add constraint users_roles_fk foreign key (ers_user_id)
references ers_user_roles (ers_user_role_id);

alter table ers_users add constraint ers_users_unv1 unique (ers_username, user_email);

insert into ers_reimbursement_type (reimb_type) values ('Lodging'), ('Travel'), ('Food'), ('Other'); 