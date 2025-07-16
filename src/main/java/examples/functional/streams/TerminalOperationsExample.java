package examples.functional.streams;

import utils.Account;
import utils.AccountStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import utils.Status;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        {   // collect method
            List<Account> acc = new ArrayList<>(List.of(
                    new Account(20000, "IT123"),
                    new Account(15000, "IT152"),
                    new Account(30000, "ES931")
            ));
            Stream<Account> accountStream1 = acc.stream();
            List<Account> accountsList = accountStream1.collect(Collectors.toList());
            Stream<Account> accountStream2 = acc.stream();
            Set<Account> accountsSet = accountStream2.collect(Collectors.toSet());


            long sum = accountsList.stream()
                    // synthetic form of .summingLong(a -> a.getBalance())
                    .collect(Collectors.summingLong(Account::getBalance));
            System.out.println(sum);
            double avg = accountsList.stream()
                    // synthetic form of .averagingLong(a -> a.getBalance())
                    .collect(Collectors.averagingDouble(Account::getBalance));
            System.out.println(avg);
        }
        {   // partitioning
            List<Account> accounts = List.of(
                    new Account(3333L, "530012"),
                    new Account(15000L, "771843"),
                    new Account(0L, "681891")
            );
            Map<Boolean, List<Account>> accountsByBalance = accounts.stream()
                    .collect(Collectors.partitioningBy(a -> a.getBalance() >= 10000));
            System.out.println(accountsByBalance);
        }
        {   // grouping
            List<AccountStatus> accounts = List.of(
                    new AccountStatus(3333L, "530012", Status.REMOVED),
                    new AccountStatus(15000L, "771843", Status.ACTIVE),
                    new AccountStatus(0L, "681891", Status.BLOCKED)
            );
            Map<Status, List<AccountStatus>> accountsByStatus = accounts.stream()
                    .collect(Collectors.groupingBy(AccountStatus::getStatus));
            System.out.println(accountsByStatus);
        }
        {   // downstream collector
            List<AccountStatus> accounts = List.of(
                    new AccountStatus(3333L, "530012", Status.ACTIVE),
                    new AccountStatus(15000L, "771843", Status.BLOCKED),
                    new AccountStatus(15000L, "234465", Status.ACTIVE),
                    new AccountStatus(8800L, "110011", Status.ACTIVE),
                    new AccountStatus(45000L, "462181", Status.BLOCKED),
                    new AccountStatus(0L, "681891", Status.REMOVED)
            );
            Map<Status, Long> sumByStatus = accounts.stream()
                    .collect(Collectors.groupingBy(
                            AccountStatus::getStatus,
                            Collectors.summingLong(AccountStatus::getBalance)
                    ));
            System.out.println(sumByStatus);
        }
    }
}
