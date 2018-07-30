package com.testing.processor;

import com.testing.model.Contract;
import com.testing.model.DslContract;
import com.testing.model.ElectricityContract;
import com.testing.model.RentContract;

import java.util.ArrayList;

public class ContractProcessorImpl implements ContractProcessor {

    @Override
    public void processContract(Contract contract) {

        contract.process();
    }

    public static void main(String[] args) {

        ArrayList<Contract> contracts = new ArrayList<>();
        contracts.add(new DslContract());
        contracts.add(new ElectricityContract());
        contracts.add(new RentContract());

        ContractProcessor processor = new ContractProcessorImpl();
        for(Contract contract: contracts){
            processor.processContract(contract);
        }
    }
}
