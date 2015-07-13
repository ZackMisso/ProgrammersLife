//
//  EventController.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/12/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "TimeStamp.h"

@interface EventController : NSObject{
    NSMutableArray *events;
}

-(NSMutableArray*)getAllEventsForMonth:(TimeStamp*)time;
-(void)clearMonth:(TimeStamp*)time;

// getter methods
-(NSMutableArray*)getEvents;

// setter methods
-(void)setEvents:(NSMutableArray*)param;

@end
