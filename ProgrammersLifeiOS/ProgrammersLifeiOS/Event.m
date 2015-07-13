//
//  Event.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/12/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Event.h"

@implementation Event

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}

// getter methods
-(TimeStamp*)getDate { return date; }

// setter methods
-(void)setData:(TimeStamp*)value { date = value; }

@end