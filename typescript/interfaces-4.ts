interface Account {
    owner: string;
}

interface BankAccount extends Account {
    accountNo: number;
}

let nicksAccount = <BankAccount>{};

nicksAccount.accountNo = 456456;
nicksAccount.owner = 'Daves mother';

console.log(nicksAccount.accountNo, nicksAccount.owner, nicksAccount)