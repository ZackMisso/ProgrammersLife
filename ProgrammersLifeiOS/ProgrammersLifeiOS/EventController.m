//
//  EventController.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/12/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "EventController.h"
#import "Event.h"

@implementation EventController

-(id)init{
    if(self = [super init]){
        events = [[NSMutableArray alloc]init];
        // to be implemented
    }
    return self;
}

-(NSMutableArray*)getAllEventsForMonth:(TimeStamp*)time{
    NSMutableArray *monthEvents = [[NSMutableArray alloc]init];
    int month = [time getMonth];
    for(int i = 0; i < [events count]; i++)
        if([[(Event*)[events objectAtIndex:i] getDate] getMonth] == month)
            [monthEvents addObject:[events objectAtIndex:i]];
    return monthEvents;
}

-(void)clearMonth:(TimeStamp*)time{ // TODO :: TEST
    int month = [time getMonth];
    for(int i = 0; i < [events count]; i++)
        if([[(Event*)[events objectAtIndex:i] getDate] getMonth] == month){
            [events removeObjectAtIndex:i];
            i--;
        }
}

// getter methods
-(NSMutableArray*)getEvents { return events; }

// setter methods
-(void)setEvents:(NSMutableArray*)param { events = param; }

@end
