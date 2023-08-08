package com.multicampus.springex;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("oracle")
public class SampleDAOO_Oracle_Impl implements SampleDAO{
}


