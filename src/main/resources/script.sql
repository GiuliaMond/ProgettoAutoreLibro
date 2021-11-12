-- Table: public.padrone

-- DROP TABLE public.padrone;

CREATE TABLE IF NOT EXISTS public.autore
(
    id integer NOT NULL,
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    cognome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    eta integer not NULL,
    CONSTRAINT autore_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;


CREATE TABLE IF NOT EXISTS public.libro
(
    id integer NOT NULL,
    titolo character varying(50) COLLATE pg_catalog."default" NOT NULL,
	numero_pagine integer NOT NULL,
    CONSTRAINT libro_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;